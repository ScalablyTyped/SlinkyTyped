package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetBoundaryRequestOptions extends js.Object {
  /**
    * Specifies the preferred language to use for any metadata text about the entity or polygons. Defaults to the culture used by the map control, which
    * usually automatically detected based on user's browser settings. Setting this property will override the default value.
    */
  var culture: js.UndefOr[String] = js.native
  /**
    * The entity type to return. Default: CountryRegion
    * Supported entity types:
    * AdminDivision1, AdminDivision2, CountryRegion, eighborhood, PopulatedPlace, Postcode1, Postcode2, Postcode3, Postcode4
    * Note: Not all entity types are available in all areas.
    */
  var entityType: js.UndefOr[String] = js.native
  /**
    * Specifies whether the response should include all of the boundary polygons for the requested entity or just return a single polygon that represents
    * the main outline of the entity. Default: false
    */
  var getAllPolygons: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the response should include metadata about the entity, such as AreaSqKm and others. Default: false
    */
  var getEntityMetadata: js.UndefOr[Boolean] = js.native
  /**
    * The level of detail for the boundary polygons returned. An integer between 0 and 3, where 0 specifies the coarsest level of boundary detail and 3
    * specifies the best. Default: 0
    */
  var lod: js.UndefOr[Double] = js.native
  /**
    * Specifies the user’s home country or region.Defaults to the region setting of the user who loads the map.
    * Warning: Setting this property will override the default value, which is the region the user is actually in, and will allow the user to see boundaries
    * which may not align with the views of their region.This could result in geopolitically sensitive borders being returned.
    */
  var userRegion: js.UndefOr[String] = js.native
}

object IGetBoundaryRequestOptions {
  @scala.inline
  def apply(): IGetBoundaryRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetBoundaryRequestOptions]
  }
  @scala.inline
  implicit class IGetBoundaryRequestOptionsOps[Self <: IGetBoundaryRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllPolygons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetAllPolygons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllPolygons")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEntityMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetEntityMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withLod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lod")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRegion")(js.undefined)
        ret
    }
  }
  
}

