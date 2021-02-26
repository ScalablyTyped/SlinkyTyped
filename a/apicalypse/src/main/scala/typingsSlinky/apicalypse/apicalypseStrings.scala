package typingsSlinky.apicalypse

import typingsSlinky.apicalypse.mod.QueryMethod
import typingsSlinky.apicalypse.mod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apicalypseStrings {
  
  @js.native
  sealed trait asc extends SortDirection
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait body extends QueryMethod
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait desc extends SortDirection
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait url extends QueryMethod
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}
