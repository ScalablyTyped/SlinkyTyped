package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipSchemes extends Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemes)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average basemap color is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemes)
    */
  var basemapTheme: String = js.native
  /**
    * The relationship scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemes)
    */
  var primaryScheme: RelationshipScheme = js.native
  /**
    * Additional relationship schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemes)
    */
  var secondarySchemes: js.Array[RelationshipScheme] = js.native
}

object RelationshipSchemes {
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: RelationshipScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[RelationshipScheme]
  ): RelationshipSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipSchemes]
  }
  @scala.inline
  implicit class RelationshipSchemesOps[Self <: RelationshipSchemes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasemapId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasemapTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryScheme(value: RelationshipScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondarySchemes(value: js.Array[RelationshipScheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySchemes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

