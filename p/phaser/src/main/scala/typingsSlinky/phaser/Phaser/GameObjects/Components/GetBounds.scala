package typingsSlinky.phaser.Phaser.GameObjects.Components

import typingsSlinky.phaser.Phaser.Geom.Rectangle
import typingsSlinky.phaser.Phaser.Math.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods used for obtaining the bounds of a Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait GetBounds extends js.Object {
  
  /**
    * Gets the bottom-center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getBottomCenter[O /* <: Vector2 */](): O = js.native
  def getBottomCenter[O /* <: Vector2 */](output: O): O = js.native
  def getBottomCenter[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
  def getBottomCenter[O /* <: Vector2 */](output: js.UndefOr[scala.Nothing], includeParent: Boolean): O = js.native
  
  /**
    * Gets the bottom-left corner coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getBottomLeft[O /* <: Vector2 */](): O = js.native
  def getBottomLeft[O /* <: Vector2 */](output: O): O = js.native
  def getBottomLeft[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
  def getBottomLeft[O /* <: Vector2 */](output: js.UndefOr[scala.Nothing], includeParent: Boolean): O = js.native
  
  /**
    * Gets the bottom-right corner coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getBottomRight[O /* <: Vector2 */](): O = js.native
  def getBottomRight[O /* <: Vector2 */](output: O): O = js.native
  def getBottomRight[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
  def getBottomRight[O /* <: Vector2 */](output: js.UndefOr[scala.Nothing], includeParent: Boolean): O = js.native
  
  /**
    * Gets the bounds of this Game Object, regardless of origin.
    * The values are stored and returned in a Rectangle, or Rectangle-like, object.
    * @param output An object to store the values in. If not provided a new Rectangle will be created.
    */
  def getBounds[O /* <: Rectangle */](): O = js.native
  def getBounds[O /* <: Rectangle */](output: O): O = js.native
  
  /**
    * Gets the center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    */
  def getCenter[O /* <: Vector2 */](): O = js.native
  def getCenter[O /* <: Vector2 */](output: O): O = js.native
  
  /**
    * Gets the left-center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getLeftCenter[O /* <: Vector2 */](): O = js.native
  def getLeftCenter[O /* <: Vector2 */](output: O): O = js.native
  def getLeftCenter[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
  def getLeftCenter[O /* <: Vector2 */](output: js.UndefOr[scala.Nothing], includeParent: Boolean): O = js.native
  
  /**
    * Gets the right-center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getRightCenter[O /* <: Vector2 */](): O = js.native
  def getRightCenter[O /* <: Vector2 */](output: O): O = js.native
  def getRightCenter[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
  def getRightCenter[O /* <: Vector2 */](output: js.UndefOr[scala.Nothing], includeParent: Boolean): O = js.native
  
  /**
    * Gets the top-center coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getTopCenter[O /* <: Vector2 */](): O = js.native
  def getTopCenter[O /* <: Vector2 */](output: O): O = js.native
  def getTopCenter[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
  def getTopCenter[O /* <: Vector2 */](output: js.UndefOr[scala.Nothing], includeParent: Boolean): O = js.native
  
  /**
    * Gets the top-left corner coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getTopLeft[O /* <: Vector2 */](): O = js.native
  def getTopLeft[O /* <: Vector2 */](output: O): O = js.native
  def getTopLeft[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
  def getTopLeft[O /* <: Vector2 */](output: js.UndefOr[scala.Nothing], includeParent: Boolean): O = js.native
  
  /**
    * Gets the top-right corner coordinate of this Game Object, regardless of origin.
    * The returned point is calculated in local space and does not factor in any parent containers
    * @param output An object to store the values in. If not provided a new Vector2 will be created.
    * @param includeParent If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector? Default false.
    */
  def getTopRight[O /* <: Vector2 */](): O = js.native
  def getTopRight[O /* <: Vector2 */](output: O): O = js.native
  def getTopRight[O /* <: Vector2 */](output: O, includeParent: Boolean): O = js.native
  def getTopRight[O /* <: Vector2 */](output: js.UndefOr[scala.Nothing], includeParent: Boolean): O = js.native
}
