package typingsSlinky.imagekit.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ImageKit {
  
  type Callback[T, E /* <: js.Error */] = js.Function2[/* error */ js.UndefOr[E], /* response */ js.UndefOr[T], scala.Unit]
  
  /**
    * @see {@link https://help.imagekit.io/en/articles/2434102-image-format-support-in-imagekit-for-resizing-compression-and-static-file-delivery}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.imagekit.imagekitStrings.jpg
    - typingsSlinky.imagekit.imagekitStrings.png
    - typingsSlinky.imagekit.imagekitStrings.gif
    - typingsSlinky.imagekit.imagekitStrings.svg
    - typingsSlinky.imagekit.imagekitStrings.webp
    - typingsSlinky.imagekit.imagekitStrings.pdf
    - typingsSlinky.imagekit.imagekitStrings.js_
    - typingsSlinky.imagekit.imagekitStrings.css
    - typingsSlinky.imagekit.imagekitStrings.txt
    - typingsSlinky.imagekit.imagekitStrings.mp4
    - typingsSlinky.imagekit.imagekitStrings.webm
    - typingsSlinky.imagekit.imagekitStrings.mov
    - typingsSlinky.imagekit.imagekitStrings.swf
    - typingsSlinky.imagekit.imagekitStrings.ts
    - typingsSlinky.imagekit.imagekitStrings.m3u8
    - java.lang.String
  */
  type FileFormat = typingsSlinky.imagekit.mod.global.ImageKit._FileFormat | java.lang.String
}
