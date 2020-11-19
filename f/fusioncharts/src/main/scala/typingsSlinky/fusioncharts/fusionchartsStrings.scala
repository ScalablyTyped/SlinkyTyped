package typingsSlinky.fusioncharts

import typingsSlinky.fusioncharts.mod.ChartDataFormats
import typingsSlinky.fusioncharts.mod.ImageHAlign
import typingsSlinky.fusioncharts.mod.ImageVAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusionchartsStrings {
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def csv: csv = "csv".asInstanceOf[csv]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def jsonurl: jsonurl = "jsonurl".asInstanceOf[jsonurl]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
  
  @scala.inline
  def xmlurl: xmlurl = "xmlurl".asInstanceOf[xmlurl]
  
  @js.native
  sealed trait bottom extends ImageVAlign
  
  @js.native
  sealed trait csv extends ChartDataFormats
  
  @js.native
  sealed trait json extends ChartDataFormats
  
  @js.native
  sealed trait jsonurl extends ChartDataFormats
  
  @js.native
  sealed trait left extends ImageHAlign
  
  @js.native
  sealed trait middle
    extends ImageHAlign
       with ImageVAlign
  
  @js.native
  sealed trait right extends ImageHAlign
  
  @js.native
  sealed trait top extends ImageVAlign
  
  @js.native
  sealed trait xml extends ChartDataFormats
  
  @js.native
  sealed trait xmlurl extends ChartDataFormats
}
