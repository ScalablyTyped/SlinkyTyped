package typingsSlinky.exif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExifCallback = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* data */ typingsSlinky.exif.mod.ExifData, 
    /* dataPath */ java.lang.String, 
    scala.Unit
  ]
  type ExifImageCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* data */ typingsSlinky.exif.mod.ExifData, 
    scala.Unit
  ]
}
