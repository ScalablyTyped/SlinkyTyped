package typingsSlinky.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namespace extends StObject {
  
  var instance: typingsSlinky.firebaseDatabaseTypes.mod.Database = js.native
  
  var namespace: DataSnapshot = js.native
}
object Namespace {
  
  @scala.inline
  def apply(instance: typingsSlinky.firebaseDatabaseTypes.mod.Database, namespace: DataSnapshot): Namespace = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  
  @scala.inline
  implicit class NamespaceMutableBuilder[Self <: Namespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: typingsSlinky.firebaseDatabaseTypes.mod.Database): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: DataSnapshot): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
