package typingsSlinky.exif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exifMod {
  type ExifCallback = js.Function3[/* error */ js.Error | Null, /* data */ ExifData, /* dataPath */ String, Unit]
  type ExifImageCallback = js.Function2[/* error */ js.Error | Null, /* data */ ExifData, Unit]
}
