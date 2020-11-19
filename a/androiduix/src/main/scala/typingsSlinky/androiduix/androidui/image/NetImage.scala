package typingsSlinky.androiduix.androidui.image

import typingsSlinky.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetImage extends js.Object {
  
  def addLoadListener(onload: js.Function0[Unit]): Unit = js.native
  def addLoadListener(onload: js.Function0[Unit], onerror: js.Function0[Unit]): Unit = js.native
  
  var browserImage: js.Any = js.native
  
  /* protected */ def createImage(): Unit = js.native
  
  /* private */ def fireOnError(): js.Any = js.native
  
  /* private */ def fireOnLoad(): js.Any = js.native
  
  def getBorderPixels(
    callBack: js.Function4[
      /* leftBorder */ js.Array[Double], 
      /* topBorder */ js.Array[Double], 
      /* rightBorder */ js.Array[Double], 
      /* bottomBorder */ js.Array[Double], 
      Unit
    ]
  ): Unit = js.native
  
  def getImageRatio(): Double = js.native
  
  def getPixels(bound: Rect, callBack: js.Function1[/* data */ js.Array[Double], Unit]): Unit = js.native
  
  val height: Double = js.native
  
  /* protected */ def init(src: String): Unit = js.native
  
  def isImageLoaded(): Boolean = js.native
  
  /* protected */ def loadImage(): Unit = js.native
  
  var mImageHeight: js.Any = js.native
  
  var mImageLoaded: js.Any = js.native
  
  var mImageWidth: js.Any = js.native
  
  var mOnErrors: js.Any = js.native
  
  var mOnLoads: js.Any = js.native
  
  var mOverrideImageRatio: js.Any = js.native
  
  var mSrc: js.Any = js.native
  
  def recycle(): Unit = js.native
  
  def removeLoadListener(): Unit = js.native
  def removeLoadListener(onload: js.UndefOr[scala.Nothing], onerror: js.Function0[Unit]): Unit = js.native
  def removeLoadListener(onload: js.Function0[Unit]): Unit = js.native
  def removeLoadListener(onload: js.Function0[Unit], onerror: js.Function0[Unit]): Unit = js.native
  
  var src: String = js.native
  
  val width: Double = js.native
}
