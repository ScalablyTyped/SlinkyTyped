package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The PathItem class is the base for any items that describe paths and
  *     offer standardised methods for drawing and path manipulation, such as
  *     {@link Path} and {@link CompoundPath}.
  */
@JSGlobal("paper.PathItem")
@js.native
class PathItem ()
  extends typingsSlinky.paper.paper.PathItem
/* static members */
@JSGlobal("paper.PathItem")
@js.native
object PathItem extends js.Object {
  
  /** 
    * Creates a path item from the given object, determining if the
    * contained information describes a plain path or a compound-path with
    * multiple sub-paths.
    * 
    * @param object - an object containing the properties describing
    *     the item to be created
    * 
    * @return the newly created path item
    */
  def create(`object`: js.Object): typingsSlinky.paper.paper.Path | typingsSlinky.paper.paper.CompoundPath = js.native
  /** 
    * Creates a path item from the given SVG path-data, determining if the
    * data describes a plain path or a compound-path with multiple
    * sub-paths.
    * 
    * @param pathData - the SVG path-data to parse
    * 
    * @return the newly created path item
    */
  def create(pathData: String): typingsSlinky.paper.paper.Path | typingsSlinky.paper.paper.CompoundPath = js.native
  /** 
    * Creates a path item from the given segments array, determining if the
    * array describes a plain path or a compound-path with multiple
    * sub-paths.
    * 
    * @param segments - the segments array to parse
    * 
    * @return the newly created path item
    */
  def create(segments: js.Array[js.Array[Double]]): typingsSlinky.paper.paper.Path | typingsSlinky.paper.paper.CompoundPath = js.native
}
