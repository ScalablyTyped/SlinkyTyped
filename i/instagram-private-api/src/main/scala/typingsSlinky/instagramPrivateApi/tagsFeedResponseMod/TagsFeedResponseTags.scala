package typingsSlinky.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsFeedResponseTags extends js.Object {
  
  var address: String = js.native
  
  var city: String = js.native
  
  var external_source: String = js.native
  
  var facebook_places_id: String = js.native
  
  var lat: String = js.native
  
  var lng: String = js.native
  
  var name: String = js.native
  
  var pk: Double = js.native
  
  var short_name: String = js.native
}
object TagsFeedResponseTags {
  
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: String,
    lat: String,
    lng: String,
    name: String,
    pk: Double,
    short_name: String
  ): TagsFeedResponseTags = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseTags]
  }
  
  @scala.inline
  implicit class TagsFeedResponseTagsOps[Self <: TagsFeedResponseTags] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_source(value: String): Self = this.set("external_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebook_places_id(value: String): Self = this.set("facebook_places_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLat(value: String): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: String): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
  }
}
