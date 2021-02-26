package typingsSlinky.mongration

import typingsSlinky.mongodb.mod.Db
import typingsSlinky.mongration.mongrationStrings.`not-run`
import typingsSlinky.mongration.mongrationStrings.`rollback-error`
import typingsSlinky.mongration.mongrationStrings.error
import typingsSlinky.mongration.mongrationStrings.ok
import typingsSlinky.mongration.mongrationStrings.pending
import typingsSlinky.mongration.mongrationStrings.rollback
import typingsSlinky.mongration.mongrationStrings.skipped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongration", "Migration")
  @js.native
  class Migration protected () extends StObject {
    def this(dbConfig: DbConfig) = this()
    
    def add(paths: String): Unit = js.native
    def add(paths: js.Array[String]): Unit = js.native
    
    def addAllFromPath(path: String): Unit = js.native
    
    def migrate(): Unit = js.native
    def migrate(doneCb: js.Function2[/* err */ js.Error | Null, /* response */ js.Array[MigrationResponse], Unit]): Unit = js.native
  }
  
  @js.native
  trait DbConfig extends StObject {
    
    var db: js.UndefOr[String] = js.native
    
    var hosts: js.UndefOr[String] = js.native
    
    var migrationCollection: String = js.native
    
    var mongoUri: js.UndefOr[String] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var replicaSet: js.UndefOr[String] = js.native
    
    var user: js.UndefOr[String] = js.native
  }
  object DbConfig {
    
    @scala.inline
    def apply(migrationCollection: String): DbConfig = {
      val __obj = js.Dynamic.literal(migrationCollection = migrationCollection.asInstanceOf[js.Any])
      __obj.asInstanceOf[DbConfig]
    }
    
    @scala.inline
    implicit class DbConfigMutableBuilder[Self <: DbConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      @scala.inline
      def setMigrationCollection(value: String): Self = StObject.set(x, "migrationCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMongoUri(value: String): Self = StObject.set(x, "mongoUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMongoUriUndefined: Self = StObject.set(x, "mongoUri", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait MigrationResponse extends StObject {
    
    var id: String = js.native
    
    var status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error` = js.native
  }
  object MigrationResponse {
    
    @scala.inline
    def apply(id: String, status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): MigrationResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrationResponse]
    }
    
    @scala.inline
    implicit class MigrationResponseMutableBuilder[Self <: MigrationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MigrationStep extends StObject {
    
    var down: js.UndefOr[
        js.Function2[/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit]
      ] = js.native
    
    var id: String = js.native
    
    def up(db: Db, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  object MigrationStep {
    
    @scala.inline
    def apply(id: String, up: (Db, js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): MigrationStep = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], up = js.Any.fromFunction2(up))
      __obj.asInstanceOf[MigrationStep]
    }
    
    @scala.inline
    implicit class MigrationStepMutableBuilder[Self <: MigrationStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: (/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUp(value: (Db, js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): Self = StObject.set(x, "up", js.Any.fromFunction2(value))
    }
  }
}
