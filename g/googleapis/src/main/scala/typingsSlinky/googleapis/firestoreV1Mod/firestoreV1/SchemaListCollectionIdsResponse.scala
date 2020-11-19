package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from Firestore.ListCollectionIds.
  */
@js.native
trait SchemaListCollectionIdsResponse extends js.Object {
  
  /**
    * The collection ids.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A page token that may be used to continue the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListCollectionIdsResponse {
  
  @scala.inline
  def apply(): SchemaListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCollectionIdsResponse]
  }
  
  @scala.inline
  implicit class SchemaListCollectionIdsResponseOps[Self <: SchemaListCollectionIdsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollectionIdsVarargs(value: String*): Self = this.set("collectionIds", js.Array(value :_*))
    
    @scala.inline
    def setCollectionIds(value: js.Array[String]): Self = this.set("collectionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionIds: Self = this.set("collectionIds", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
