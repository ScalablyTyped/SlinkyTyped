package typingsSlinky.mysqlImport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mysql-import", "config")
  @js.native
  def config(settings: Settings): Importer = js.native
  
  @js.native
  trait Importer extends StObject {
    
    /**
      * Import an .sql file to the database.
      */
    def `import`(filename: String): js.Promise[Unit] = js.native
  }
  object Importer {
    
    @scala.inline
    def apply(`import`: String => js.Promise[Unit]): Importer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[Importer]
    }
    
    @scala.inline
    implicit class ImporterMutableBuilder[Self <: Importer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImport(value: String => js.Promise[Unit]): Self = StObject.set(x, "import", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * The database to connect to.
      */
    var database: String = js.native
    
    /**
      * The MySQL host to connect to.
      */
    var host: String = js.native
    
    /**
      * Function to handle errors. The function will receive the Error. If not provided the error will be thrown.
      */
    var onerror: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
    
    /**
      * The password for the user.
      */
    var password: String = js.native
    
    /**
      * The MySQL port to connect to.
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * The MySQL user to connect with.
      */
    var user: String = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(database: String, host: String, password: String, user: String): Settings = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnerror(value: /* error */ js.Any => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
