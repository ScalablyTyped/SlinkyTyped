package typingsSlinky.preloadjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.RequestUtils")
@js.native
class RequestUtils ()
  extends typingsSlinky.preloadjs.createjs.RequestUtils
/* static members */
@JSGlobal("createjs.RequestUtils")
@js.native
object RequestUtils extends js.Object {
  
  // properties
  var ABSOLUTE_PATH: js.RegExp = js.native
  
  var EXTENSION_PATT: js.RegExp = js.native
  
  var RELATIVE_PATH: js.RegExp = js.native
  
  // methods
  def buildPath(src: String): String = js.native
  def buildPath(src: String, data: js.Object): String = js.native
  
  def formatQueryString(data: js.Object): String = js.native
  def formatQueryString(data: js.Object, query: js.Array[js.Object]): String = js.native
  
  def getTypeByExtension(extension: String): String = js.native
  
  def isAudioTag(item: js.Object): Boolean = js.native
  
  def isBinary(`type`: String): Boolean = js.native
  
  def isCrossDomain(item: js.Object): Boolean = js.native
  
  def isImageTag(item: js.Object): Boolean = js.native
  
  def isLocal(item: js.Object): Boolean = js.native
  
  def isText(`type`: String): Boolean = js.native
  
  def isVideoTag(item: js.Object): Boolean = js.native
  
  def parseURI(path: String): js.Object = js.native
}
