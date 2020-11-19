package typingsSlinky.images

import typingsSlinky.images.mod.SupportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagesStrings {
  
  @scala.inline
  def bmp: bmp = "bmp".asInstanceOf[bmp]
  
  @scala.inline
  def gif: gif = "gif".asInstanceOf[gif]
  
  @scala.inline
  def jpg: jpg = "jpg".asInstanceOf[jpg]
  
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  
  @scala.inline
  def webp: webp = "webp".asInstanceOf[webp]
  
  @js.native
  sealed trait bmp extends SupportType
  
  @js.native
  sealed trait gif extends SupportType
  
  @js.native
  sealed trait jpg extends SupportType
  
  @js.native
  sealed trait png extends SupportType
  
  @js.native
  sealed trait raw extends SupportType
  
  @js.native
  sealed trait webp extends SupportType
}
