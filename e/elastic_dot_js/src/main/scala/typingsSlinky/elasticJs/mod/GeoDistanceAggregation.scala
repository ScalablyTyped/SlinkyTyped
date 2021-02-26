package typingsSlinky.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "GeoDistanceAggregation")
@js.native
class GeoDistanceAggregation protected () extends Aggregation {
  /*
    Aggregation that works on geo_point fields and conceptually works very
    similar to the range aggregation.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): GeoDistanceAggregation = js.native
  
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): GeoDistanceAggregation = js.native
  
  /*
    Sets the point of origin from where distances will be measured. Same as
    origin.
    */
  def center(p: GeoPoint): GeoDistanceAggregation = js.native
  
  /*
    How to compute the distance. Valid values are:
    plane, arc, sloppy_arc, and factor.
    */
  def distanceType(`type`: String): GeoDistanceAggregation = js.native
  
  /*
    Sets the field to gather terms from.
    */
  def field(field: String): GeoDistanceAggregation = js.native
  
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: Boolean): GeoDistanceAggregation = js.native
  
  /*
    Sets the point of origin from where distances will be measured.
    */
  def origin(p: GeoPoint): GeoDistanceAggregation = js.native
  
  /*
    Sets the point of origin from where distances will be measured. Same as
    origin.
    */
  def point(p: GeoPoint): GeoDistanceAggregation = js.native
  
  /*
    Adds a range to the list of exsiting range expressions.
    */
  def range(from: String, to: String, key: String): GeoDistanceAggregation = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Sets the distance unit.  Valid values are:
    in, yd, ft, km, NM, mm, cm, mi, and m.
    */
  def unit(unit: String): GeoDistanceAggregation = js.native
}
