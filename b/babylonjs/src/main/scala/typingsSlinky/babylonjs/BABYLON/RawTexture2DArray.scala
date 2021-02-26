package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawTexture2DArray extends Texture {
  
  /** Gets or sets the texture format to use */
  var format: Double = js.native
  
  /**
    * Update the texture with new data
    * @param data defines the data to store in the texture
    */
  def update(data: js.typedarray.ArrayBufferView): Unit = js.native
}
