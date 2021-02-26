package typingsSlinky.aframe.anon

import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofImageUtils extends StObject {
  
  var crossOrigin: String = js.native
  
  def getDataURL(image: js.Any): String = js.native
  
  def loadTexture(url: String): Texture = js.native
  def loadTexture(
    url: String,
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTexture(url: String, mapping: js.UndefOr[scala.Nothing], onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTexture(
    url: String,
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTexture(url: String, mapping: Mapping): Texture = js.native
  def loadTexture(
    url: String,
    mapping: Mapping,
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTexture(url: String, mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTexture(
    url: String,
    mapping: Mapping,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  
  def loadTextureCube(array: js.Array[String]): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ Texture, Unit]
  ): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Mapping): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: Mapping,
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: Mapping,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Texture = js.native
}
