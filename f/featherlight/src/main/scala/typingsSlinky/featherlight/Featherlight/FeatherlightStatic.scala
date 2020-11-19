package typingsSlinky.featherlight.Featherlight

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.featherlight.JQuery
import typingsSlinky.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatherlightStatic
  extends Instantiable0[typingsSlinky.featherlight.Featherlight.Featherlight]
     with Instantiable1[
      (/* config */ Config) | (/* $content */ JQuery) | (/* $content */ String), 
      typingsSlinky.featherlight.Featherlight.Featherlight
    ]
     with Instantiable2[
      (/* $content */ JQuery) | (/* $content */ String), 
      /* config */ Config, 
      typingsSlinky.featherlight.Featherlight.Featherlight
    ] {
  
  def apply(): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def apply($content: String): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def apply($content: String, config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def apply($content: JQuery): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def apply($content: JQuery, config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def apply(config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  
  def attach($source: JQuery): JQuery = js.native
  def attach($source: JQuery, $content: String): JQuery = js.native
  def attach($source: JQuery, $content: String, config: Config): JQuery = js.native
  def attach($source: JQuery, $content: JQuery): JQuery = js.native
  def attach($source: JQuery, $content: JQuery, config: Config): JQuery = js.native
  def attach($source: JQuery, config: Config): JQuery = js.native
  
  var autoBind: Boolean | String = js.native
  
  def close(): JQueryPromise[JQuery] = js.native
  
  var contentFilters: ContentFilters = js.native
  
  def current(): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  
  var defaults: Config = js.native
  
  def extend(child: js.Any, defaults: js.Any): js.Any = js.native
  
  var functionAttributes: js.Array[String] = js.native
  
  var id: Double = js.native
  
  def opened(): js.Array[typingsSlinky.featherlight.Featherlight.Featherlight] = js.native
  
  def readElementConfig(element: HTMLElement, namespace: String): js.Any = js.native
}
