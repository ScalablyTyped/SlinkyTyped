package typingsSlinky.routeNode

import typingsSlinky.routeNode.routeNodeMod.QueryParamsMode
import typingsSlinky.routeNode.routeNodeMod.TrailingSlashMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeNodeStrings {
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait always extends TrailingSlashMode
  
  @js.native
  sealed trait default
    extends QueryParamsMode
       with TrailingSlashMode
  
  @js.native
  sealed trait loose extends QueryParamsMode
  
  @js.native
  sealed trait never extends TrailingSlashMode
  
  @js.native
  sealed trait query extends js.Object
  
  @js.native
  sealed trait strict extends QueryParamsMode
  
  @js.native
  sealed trait url extends js.Object
}
