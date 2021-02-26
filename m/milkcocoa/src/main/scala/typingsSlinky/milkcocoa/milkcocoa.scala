package typingsSlinky.milkcocoa

import typingsSlinky.milkcocoa.anon.Id
import typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount
import typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser
import typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.Login
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object milkcocoa {
  
  @js.native
  trait MilkCocoa extends StObject {
    
    def addAccount(email: String, password: String): Unit = js.native
    def addAccount(
      email: String,
      password: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ AddAccount, /* user */ User, Unit]
    ): Unit = js.native
    def addAccount(email: String, password: String, options: js.Object): Unit = js.native
    def addAccount(
      email: String,
      password: String,
      options: js.Object,
      callback: js.Function2[/* err */ AddAccount, /* user */ User, Unit]
    ): Unit = js.native
    
    def dataStore(path: String): DataStore = js.native
    
    def getCurrentUser(callback: js.Function2[/* err */ GetCurrentUser, /* user */ Id, Unit]): Unit = js.native
    
    def login(email: String, password: String, callback: js.Function2[/* err */ Login, /* user */ User, Unit]): Unit = js.native
    
    def logout(): Unit = js.native
    def logout(callback: js.Function1[/* err */ String, Unit]): Unit = js.native
  }
  object MilkCocoa {
    
    object Error {
      
      @js.native
      sealed trait AddAccount extends StObject
      @JSGlobal("milkcocoa.MilkCocoa.Error.AddAccount")
      @js.native
      object AddAccount extends StObject {
        
        @js.native
        sealed trait AlreadyExist extends AddAccount
        
        // FormatError = 1, AlreadyExist = 2
        @js.native
        sealed trait FormatError extends AddAccount
      }
      
      @js.native
      sealed trait GetCurrentUser extends StObject
      @JSGlobal("milkcocoa.MilkCocoa.Error.GetCurrentUser")
      @js.native
      object GetCurrentUser extends StObject {
        
        // NotLoggedIn = 1
        @js.native
        sealed trait NotLoggedIn extends GetCurrentUser
      }
      
      @js.native
      sealed trait Login extends StObject
      @JSGlobal("milkcocoa.MilkCocoa.Error.Login")
      @js.native
      object Login extends StObject {
        
        @js.native
        sealed trait EmailNotVerificated extends Login
        
        // FormatError = 1, LoginError = 2, EmailNotVerificated = 3
        @js.native
        sealed trait FormatError extends Login
        
        @js.native
        sealed trait LoginError extends Login
      }
    }
  }
  
  @js.native
  trait DataStore extends StObject {
    
    def child(path: String): DataStore = js.native
    
    def get(id: String, callback: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
    
    def off(event: String): Unit = js.native
    
    // event push, remove, set, send
    def on(event: String, callback: js.Function1[/* data */ DataStoreCallbackData, Unit]): Unit = js.native
    
    def parent(): DataStore = js.native
    
    def push(`object`: js.Object): Unit = js.native
    def push(`object`: js.Object, callback: js.Function1[/* data */ DataStoreCallbackData, Unit]): Unit = js.native
    
    def query(): Query = js.native
    def query(condition: js.Object): Query = js.native
    
    def remove(id: String): Unit = js.native
    
    def root(): DataStore = js.native
    
    def send(`object`: js.Object): Unit = js.native
    
    def set(id: String, data: js.Object): Unit = js.native
  }
  
  @js.native
  trait DataStoreCallbackData extends StObject {
    
    var err: String = js.native
    
    var id: String = js.native
    
    var path: String = js.native
    
    var value: js.Any = js.native
  }
  object DataStoreCallbackData {
    
    @scala.inline
    def apply(err: String, id: String, path: String, value: js.Any): DataStoreCallbackData = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataStoreCallbackData]
    }
    
    @scala.inline
    implicit class DataStoreCallbackDataMutableBuilder[Self <: DataStoreCallbackData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Query extends StObject {
    
    def done(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    
    def limit(number: Double): Query = js.native
    
    def skip(index: Double): Query = js.native
    
    // mode  asc, desc
    def sort(mode: String): Query = js.native
  }
  object Query {
    
    @scala.inline
    def apply(
      done: js.Function1[/* data */ js.Any, Unit] => Unit,
      limit: Double => Query,
      skip: Double => Query,
      sort: String => Query
    ): Query = {
      val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), limit = js.Any.fromFunction1(limit), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: js.Function1[/* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLimit(value: Double => Query): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkip(value: Double => Query): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSort(value: String => Query): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait User extends StObject {
    
    var email: String = js.native
    
    var id: String = js.native
  }
  object User {
    
    @scala.inline
    def apply(email: String, id: String): User = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
