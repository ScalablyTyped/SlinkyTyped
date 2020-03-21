package typingsSlinky.jsmediatags

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.jsmediatags.mediaFileReaderMod.default
import typingsSlinky.jsmediatags.typesMod.ByteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMediaTagReader
  extends Instantiable1[/* mediaFileReader */ default, typingsSlinky.jsmediatags.mediaTagReaderMod.default] {
  def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
  def getTagIdentifierByteRange(): ByteRange = js.native
}

