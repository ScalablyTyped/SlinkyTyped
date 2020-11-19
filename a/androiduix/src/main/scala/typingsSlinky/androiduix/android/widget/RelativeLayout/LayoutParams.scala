package typingsSlinky.androiduix.android.widget.RelativeLayout

import typingsSlinky.androiduix.android.view.ViewGroup.MarginLayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutParams extends MarginLayoutParams {
  
  def addRule(verb: Double): Unit = js.native
  def addRule(verb: Double, anchor: String): Unit = js.native
  
  var alignWithParent: Boolean = js.native
  
  def getRules(): js.Array[String] = js.native
  def getRules(layoutDirection: Double): js.Array[String] = js.native
  
  /* private */ def hasRelativeRules(): js.Any = js.native
  
  var mBottom: Double = js.native
  
  var mEnd: js.Any = js.native
  
  var mInitialRules: js.Any = js.native
  
  var mIsRtlCompatibilityMode: js.Any = js.native
  
  var mLeft: Double = js.native
  
  var mRight: Double = js.native
  
  var mRules: js.Any = js.native
  
  var mRulesChanged: js.Any = js.native
  
  var mStart: js.Any = js.native
  
  var mTop: Double = js.native
  
  def removeRule(verb: Double): Unit = js.native
  
  /* private */ def resolveRules(layoutDirection: js.Any): js.Any = js.native
}
