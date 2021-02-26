package typingsSlinky.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A compound path is a complex path that is made up of one or more
  * simple sub-paths. It can have the `nonzero` fill rule, or the `evenodd` rule
  * applied. Both rules use mathematical equations to determine if any region is
  * outside or inside the final shape. The `evenodd` rule is more predictable:
  * Every other region within a such a compound path is a hole, regardless of
  * path direction.
  * 
  * All the paths in a compound path take on the style of the compound path and
  * can be accessed through its {@link Item#children} list.
  */
@JSGlobal("paper.CompoundPath")
@js.native
class CompoundPath protected ()
  extends typingsSlinky.paper.paper.CompoundPath {
  /** 
    * Creates a new compound path item from an object description and places it
    * at the top of the active layer.
    * 
    * @param object - an object containing properties to be set on the
    *     path
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a new compound path item from SVG path-data and places it at the
    * top of the active layer.
    * 
    * @param pathData - the SVG path-data that describes the geometry
    * of this path
    */
  def this(pathData: String) = this()
}
