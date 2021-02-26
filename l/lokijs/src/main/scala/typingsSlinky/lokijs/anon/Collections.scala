package typingsSlinky.lokijs.anon

import typingsSlinky.lokijs.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collections extends StObject {
  
  var collections: js.Array[Collection[_]] = js.native
  
  var databaseVersion: Double = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var throttledSaves: Boolean = js.native
}
object Collections {
  
  @scala.inline
  def apply(collections: js.Array[Collection[_]], databaseVersion: Double, throttledSaves: Boolean): Collections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], databaseVersion = databaseVersion.asInstanceOf[js.Any], throttledSaves = throttledSaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collections]
  }
  
  @scala.inline
  implicit class CollectionsMutableBuilder[Self <: Collections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollections(value: js.Array[Collection[_]]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionsVarargs(value: Collection[js.Any]*): Self = StObject.set(x, "collections", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseVersion(value: Double): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setThrottledSaves(value: Boolean): Self = StObject.set(x, "throttledSaves", value.asInstanceOf[js.Any])
  }
}
