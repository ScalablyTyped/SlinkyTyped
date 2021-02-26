package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Color3")
@js.native
/**
  * Creates a new Color3 object from red, green, blue values, all between 0 and 1
  * @param r defines the red component (between 0 and 1, default is 0)
  * @param g defines the green component (between 0 and 1, default is 0)
  * @param b defines the blue component (between 0 and 1, default is 0)
  */
class Color3 ()
  extends typingsSlinky.babylonjs.mathsIndexMod.Color3 {
  def this(/**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: js.UndefOr[scala.Nothing],
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double,
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: js.UndefOr[scala.Nothing],
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: js.UndefOr[scala.Nothing],
    /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  b: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: js.UndefOr[scala.Nothing],
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: Double,
    /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  b: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double,
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: js.UndefOr[scala.Nothing],
    /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  b: Double
  ) = this()
  def this(
    /**
    * Defines the red component (between 0 and 1, default is 0)
    */
  r: Double,
    /**
    * Defines the green component (between 0 and 1, default is 0)
    */
  g: Double,
    /**
    * Defines the blue component (between 0 and 1, default is 0)
    */
  b: Double
  ) = this()
}
/* static members */
object Color3 {
  
  @JSImport("babylonjs/index", "Color3")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a Color3 value containing a black color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Black")
  @js.native
  def Black(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a blue color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Blue")
  @js.native
  def Blue(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Creates a new Color3 from the starting index of the given array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  @JSImport("babylonjs/index", "Color3.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  @JSImport("babylonjs/index", "Color3.FromArrayToRef")
  @js.native
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: js.UndefOr[scala.Nothing],
    result: typingsSlinky.babylonjs.mathColorMod.Color3
  ): Unit = js.native
  /**
    * Creates a new Color3 from the starting index element of the given array
    * @param array defines the source array to read from
    * @param offset defines the offset in the source array
    * @param result defines the target Color3 object
    */
  @JSImport("babylonjs/index", "Color3.FromArrayToRef")
  @js.native
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typingsSlinky.babylonjs.mathColorMod.Color3
  ): Unit = js.native
  
  /**
    * Creates a new Color3 from the string containing valid hexadecimal values
    * @param hex defines a string containing valid hexadecimal values
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.FromHexString")
  @js.native
  def FromHexString(hex: String): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Creates a new Color3 from integer values (< 256)
    * @param r defines the red component to read from (value between 0 and 255)
    * @param g defines the green component to read from (value between 0 and 255)
    * @param b defines the blue component to read from (value between 0 and 255)
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.FromInts")
  @js.native
  def FromInts(r: Double, g: Double, b: Double): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a gray color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Gray")
  @js.native
  def Gray(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a green color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Green")
  @js.native
  def Green(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Convert Hue, saturation and value to a Color3 (RGB)
    * @param hue defines the hue
    * @param saturation defines the saturation
    * @param value defines the value
    * @param result defines the Color3 where to store the RGB values
    */
  @JSImport("babylonjs/index", "Color3.HSVtoRGBToRef")
  @js.native
  def HSVtoRGBToRef(
    hue: Double,
    saturation: Double,
    value: Double,
    result: typingsSlinky.babylonjs.mathColorMod.Color3
  ): Unit = js.native
  
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param start defines the start Color3 value
    * @param end defines the end Color3 value
    * @param amount defines the gradient value between start and end
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Lerp")
  @js.native
  def Lerp(
    start: DeepImmutable[typingsSlinky.babylonjs.mathColorMod.Color3],
    end: DeepImmutable[typingsSlinky.babylonjs.mathColorMod.Color3],
    amount: Double
  ): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3
    * @param left defines the start value
    * @param right defines the end value
    * @param amount defines the gradient factor
    * @param result defines the Color3 object where to store the result
    */
  @JSImport("babylonjs/index", "Color3.LerpToRef")
  @js.native
  def LerpToRef(
    left: DeepImmutable[typingsSlinky.babylonjs.mathColorMod.Color3],
    right: DeepImmutable[typingsSlinky.babylonjs.mathColorMod.Color3],
    amount: Double,
    result: typingsSlinky.babylonjs.mathColorMod.Color3
  ): Unit = js.native
  
  /**
    * Returns a Color3 value containing a magenta color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Magenta")
  @js.native
  def Magenta(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a purple color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Purple")
  @js.native
  def Purple(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a random color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Random")
  @js.native
  def Random(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a red color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Red")
  @js.native
  def Red(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a teal color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Teal")
  @js.native
  def Teal(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a white color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.White")
  @js.native
  def White(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  /**
    * Returns a Color3 value containing a yellow color
    * @returns a new Color3 object
    */
  @JSImport("babylonjs/index", "Color3.Yellow")
  @js.native
  def Yellow(): typingsSlinky.babylonjs.mathColorMod.Color3 = js.native
  
  @JSImport("babylonjs/index", "Color3._BlackReadOnly")
  @js.native
  def _BlackReadOnly: js.Any = js.native
  @scala.inline
  def _BlackReadOnly_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BlackReadOnly")(x.asInstanceOf[js.Any])
}
