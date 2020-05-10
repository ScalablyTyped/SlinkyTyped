package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import typingsSlinky.browserfs.nodeFsStatsMod.FileType
import typingsSlinky.browserfs.nodeFsStatsMod.Stats
import typingsSlinky.browserfs.nodeFsStatsMod.default
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStats
  extends Instantiable2[/* itemType */ FileType, /* size */ Double, default]
     with Instantiable3[/* itemType */ FileType, /* size */ Double, /* mode */ Double, default]
     with Instantiable4[
      /* itemType */ FileType, 
      /* size */ Double, 
      /* mode */ Double, 
      /* atime */ js.Date, 
      default
    ]
     with Instantiable5[
      /* itemType */ FileType, 
      /* size */ Double, 
      /* mode */ Double, 
      /* atime */ js.Date, 
      /* mtime */ js.Date, 
      default
    ]
     with Instantiable6[
      /* itemType */ FileType, 
      /* size */ Double, 
      /* mode */ Double, 
      /* atime */ js.Date, 
      /* mtime */ js.Date, 
      /* ctime */ js.Date, 
      default
    ] {
  def fromBuffer(buffer: Buffer): Stats = js.native
}

