package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that manages the case where an object holds a reference to an asset and needs to be notified when
  * changes occur in the asset. e.g. notifications include load, add and remove events.
  * @example
  * var reference = new pc.AssetReference('textureAsset', this, this.app.assets, {
  *     load: this.onTextureAssetLoad,
  *     add: this.onTextureAssetAdd,
  *     remove: this.onTextureAssetRemove
  * }, this);
  * reference.id = this.textureAsset.id;
  * @property id - Get or set the asset id which this references. One of either id or url must be set to initialize an asset reference.
  * @property url - Get or set the asset url which this references. One of either id or url must be called to initialize an asset reference.
  * @param propertyName - The name of the property that the asset is stored under, passed into callbacks to enable updating.
  * @param parent - The parent object that contains the asset reference, passed into callbacks to enable updating. Currently an asset, but could be component or other.
  * @param registry - The asset registry that stores all assets.
  * @param callbacks - A set of functions called when the asset state changes: load, add, remove.
  * @param [callbacks.load] - The function called when the asset loads load(propertyName, parent, asset).
  * @param [callbacks.add] - The function called when the asset is added to the registry add(propertyName, parent, asset).
  * @param [callbacks.remove] - The function called when the asset is remove from the registry remove(propertyName, parent, asset).
  * @param [scope] - The scope to call the callbacks in
  */
@js.native
trait AssetReference extends js.Object {
  
  /**
    * Get or set the asset id which this references. One of either id or url must be set to initialize an asset reference.
    */
  var id: Double = js.native
  
  /**
    * Get or set the asset url which this references. One of either id or url must be called to initialize an asset reference.
    */
  var url: String = js.native
}
object AssetReference {
  
  @scala.inline
  def apply(id: Double, url: String): AssetReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetReference]
  }
  
  @scala.inline
  implicit class AssetReferenceOps[Self <: AssetReference] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
