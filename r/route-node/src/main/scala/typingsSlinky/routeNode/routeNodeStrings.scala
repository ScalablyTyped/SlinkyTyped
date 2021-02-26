package typingsSlinky.routeNode

import typingsSlinky.routeNode.routeNodeMod.QueryParamsMode
import typingsSlinky.routeNode.routeNodeMod.TrailingSlashMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeNodeStrings {
  
  @js.native
  sealed trait default
    extends QueryParamsMode
       with TrailingSlashMode
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait always extends TrailingSlashMode
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait loose extends QueryParamsMode
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait never extends TrailingSlashMode
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait query extends StObject
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait strict extends QueryParamsMode
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait url extends StObject
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}
