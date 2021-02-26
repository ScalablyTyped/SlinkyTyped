package typingsSlinky.hidefile

import typingsSlinky.node.Buffer
import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hidefile", "hide")
  @js.native
  def hide(
    path: String,
    callback: js.Function2[/* error */ js.Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  @JSImport("hidefile", "hide")
  @js.native
  def hide(
    path: Buffer,
    callback: js.Function2[/* error */ js.Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  @JSImport("hidefile", "hide")
  @js.native
  def hide(
    path: URL_,
    callback: js.Function2[/* error */ js.Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  
  @JSImport("hidefile", "hideSync")
  @js.native
  def hideSync(path: String): String | Buffer | URL_ = js.native
  @JSImport("hidefile", "hideSync")
  @js.native
  def hideSync(path: Buffer): String | Buffer | URL_ = js.native
  @JSImport("hidefile", "hideSync")
  @js.native
  def hideSync(path: URL_): String | Buffer | URL_ = js.native
  
  @JSImport("hidefile", "isDotPrefixed")
  @js.native
  def isDotPrefixed(path: String): Boolean = js.native
  @JSImport("hidefile", "isDotPrefixed")
  @js.native
  def isDotPrefixed(path: Buffer): Boolean = js.native
  @JSImport("hidefile", "isDotPrefixed")
  @js.native
  def isDotPrefixed(path: URL_): Boolean = js.native
  
  @JSImport("hidefile", "isHidden")
  @js.native
  def isHidden(path: String, callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, _]): Unit = js.native
  @JSImport("hidefile", "isHidden")
  @js.native
  def isHidden(path: Buffer, callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, _]): Unit = js.native
  @JSImport("hidefile", "isHidden")
  @js.native
  def isHidden(path: URL_, callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, _]): Unit = js.native
  
  @JSImport("hidefile", "isHiddenSync")
  @js.native
  def isHiddenSync(path: String): Boolean = js.native
  @JSImport("hidefile", "isHiddenSync")
  @js.native
  def isHiddenSync(path: Buffer): Boolean = js.native
  @JSImport("hidefile", "isHiddenSync")
  @js.native
  def isHiddenSync(path: URL_): Boolean = js.native
  
  @JSImport("hidefile", "reveal")
  @js.native
  def reveal(
    path: String,
    callback: js.Function2[/* error */ js.Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  @JSImport("hidefile", "reveal")
  @js.native
  def reveal(
    path: Buffer,
    callback: js.Function2[/* error */ js.Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  @JSImport("hidefile", "reveal")
  @js.native
  def reveal(
    path: URL_,
    callback: js.Function2[/* error */ js.Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  
  @JSImport("hidefile", "revealSync")
  @js.native
  def revealSync(path: String): String | Buffer | URL_ = js.native
  @JSImport("hidefile", "revealSync")
  @js.native
  def revealSync(path: Buffer): String | Buffer | URL_ = js.native
  @JSImport("hidefile", "revealSync")
  @js.native
  def revealSync(path: URL_): String | Buffer | URL_ = js.native
  
  @JSImport("hidefile", "shouldBeHidden")
  @js.native
  def shouldBeHidden(path: String, callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, _]): Unit = js.native
  @JSImport("hidefile", "shouldBeHidden")
  @js.native
  def shouldBeHidden(path: Buffer, callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, _]): Unit = js.native
  @JSImport("hidefile", "shouldBeHidden")
  @js.native
  def shouldBeHidden(path: URL_, callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, _]): Unit = js.native
  
  @JSImport("hidefile", "shouldBeHiddenSync")
  @js.native
  def shouldBeHiddenSync(path: String): Boolean = js.native
  @JSImport("hidefile", "shouldBeHiddenSync")
  @js.native
  def shouldBeHiddenSync(path: Buffer): Boolean = js.native
  @JSImport("hidefile", "shouldBeHiddenSync")
  @js.native
  def shouldBeHiddenSync(path: URL_): Boolean = js.native
}
