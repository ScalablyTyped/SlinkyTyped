package typingsSlinky.images

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.images.anon.Height
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("images", JSImport.Namespace)
  @js.native
  def apply(buffer: Buffer): ImagesStatic = js.native
  @JSImport("images", JSImport.Namespace)
  @js.native
  def apply(buffer: Buffer, start: js.UndefOr[scala.Nothing], end: Double): ImagesStatic = js.native
  @JSImport("images", JSImport.Namespace)
  @js.native
  def apply(buffer: Buffer, start: Double): ImagesStatic = js.native
  @JSImport("images", JSImport.Namespace)
  @js.native
  def apply(buffer: Buffer, start: Double, end: Double): ImagesStatic = js.native
  @JSImport("images", JSImport.Namespace)
  @js.native
  def apply(file: String): ImagesStatic = js.native
  @JSImport("images", JSImport.Namespace)
  @js.native
  def apply(image: ImagesStatic): ImagesStatic = js.native
  // tslint:disable-line unified-signatures
  @JSImport("images", JSImport.Namespace)
  @js.native
  def apply(image: ImagesStatic, x: Double, y: Double, width: Double, height: Double): ImagesStatic = js.native
  @JSImport("images", JSImport.Namespace)
  @js.native
  def apply(width: Double, height: Double): ImagesStatic = js.native
  
  @JSImport("images", "ImagesStatic")
  @js.native
  class ImagesStatic () extends StObject {
    
    def draw(image: ImagesStatic, x: Double, y: Double): ImagesStatic = js.native
    
    def encode(`type`: String): Unit = js.native
    def encode(`type`: String, config: ImagesConfig): Unit = js.native
    
    def fill(red: Double, green: Double, blue: Double): ImagesStatic = js.native
    def fill(red: Double, green: Double, blue: Double, alpha: Double): ImagesStatic = js.native
    
    def gc(): Unit = js.native
    
    def getUsedMemory(): Unit = js.native
    
    def height(): Double = js.native
    def height(height: Double): ImagesStatic = js.native
    
    def loadFromBuffer(buffer: Buffer): ImagesStatic = js.native
    
    def resize(width: Double): ImagesStatic = js.native
    def resize(width: Double, height: js.UndefOr[scala.Nothing], filter: String): ImagesStatic = js.native
    def resize(width: Double, height: Double): ImagesStatic = js.native
    def resize(width: Double, height: Double, filter: String): ImagesStatic = js.native
    
    def save(file: String): Unit = js.native
    def save(file: String, config: ImagesConfig): Unit = js.native
    def save(file: String, `type`: js.UndefOr[scala.Nothing], config: ImagesConfig): Unit = js.native
    def save(file: String, `type`: SupportType): Unit = js.native
    def save(file: String, `type`: SupportType, config: ImagesConfig): Unit = js.native
    
    def setGCThreshold(value: Double): Unit = js.native
    
    def setLimit(width: Double, height: Double): Unit = js.native
    
    def size(): Height = js.native
    def size(width: Double): ImagesStatic = js.native
    def size(width: Double, height: Double): ImagesStatic = js.native
    
    def width(): Double = js.native
    def width(width: Double): ImagesStatic = js.native
  }
  
  type ImagesConfig = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.images.imagesStrings.png
    - typingsSlinky.images.imagesStrings.jpg
    - typingsSlinky.images.imagesStrings.gif
    - typingsSlinky.images.imagesStrings.bmp
    - typingsSlinky.images.imagesStrings.raw
    - typingsSlinky.images.imagesStrings.webp
  */
  trait SupportType extends StObject
  object SupportType {
    
    @scala.inline
    def bmp: typingsSlinky.images.imagesStrings.bmp = "bmp".asInstanceOf[typingsSlinky.images.imagesStrings.bmp]
    
    @scala.inline
    def gif: typingsSlinky.images.imagesStrings.gif = "gif".asInstanceOf[typingsSlinky.images.imagesStrings.gif]
    
    @scala.inline
    def jpg: typingsSlinky.images.imagesStrings.jpg = "jpg".asInstanceOf[typingsSlinky.images.imagesStrings.jpg]
    
    @scala.inline
    def png: typingsSlinky.images.imagesStrings.png = "png".asInstanceOf[typingsSlinky.images.imagesStrings.png]
    
    @scala.inline
    def raw: typingsSlinky.images.imagesStrings.raw = "raw".asInstanceOf[typingsSlinky.images.imagesStrings.raw]
    
    @scala.inline
    def webp: typingsSlinky.images.imagesStrings.webp = "webp".asInstanceOf[typingsSlinky.images.imagesStrings.webp]
  }
}
