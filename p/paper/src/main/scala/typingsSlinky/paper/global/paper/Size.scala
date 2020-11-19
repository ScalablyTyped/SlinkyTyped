package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Size object is used to describe the size or dimensions of
  * something, through its {@link #width} and {@link #height} properties.
  */
@JSGlobal("paper.Size")
@js.native
class Size protected ()
  extends typingsSlinky.paper.paper.Size {
  /** 
    * Creates a Size object using the numbers in the given array as
    * dimensions.
    */
  def this(array: js.Array[_]) = this()
  /** 
    * Creates a Size object using the properties in the given object.
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a Size object using the {@link Point#x} and {@link Point#y}
    * values of the given Point object.
    */
  def this(point: typingsSlinky.paper.paper.Point) = this()
  /** 
    * Creates a Size object using the coordinates of the given Size object.
    */
  def this(size: typingsSlinky.paper.paper.Size) = this()
  /** 
    * Creates a Size object with the given width and height values.
    * 
    * @param width - the width
    * @param height - the height
    */
  def this(width: Double, height: Double) = this()
}
/* static members */
@JSGlobal("paper.Size")
@js.native
object Size extends js.Object {
  
  /** 
    * Returns a new size object with the largest {@link #width} and
    * {@link #height} of the supplied sizes.
    * 
    * @return the newly created size object
    */
  def max(size1: typingsSlinky.paper.paper.Size, size2: typingsSlinky.paper.paper.Size): typingsSlinky.paper.paper.Size = js.native
  
  /** 
    * Returns a new size object with the smallest {@link #width} and
    * {@link #height} of the supplied sizes.
    * 
    * @return the newly created size object
    */
  def min(size1: typingsSlinky.paper.paper.Size, size2: typingsSlinky.paper.paper.Size): typingsSlinky.paper.paper.Size = js.native
  
  /** 
    * Returns a size object with random {@link #width} and {@link #height}
    * values between `0` and `1`.
    * 
    * @return the newly created size object
    */
  def random(): typingsSlinky.paper.paper.Size = js.native
}
