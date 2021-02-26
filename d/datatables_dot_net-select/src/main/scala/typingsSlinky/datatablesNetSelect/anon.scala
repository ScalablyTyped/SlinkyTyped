package typingsSlinky.datatablesNetSelect

import typingsSlinky.datatablesNetSelect.DataTables.Api
import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.api
import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.multi
import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.os
import typingsSlinky.datatablesNetSelect.datatablesNetSelectStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Style extends StObject {
    
    /*
      * Get the current selection style applied to the table
      */
    def style(): String = js.native
    /*
      * Set the table's selection style
      */
    @JSName("style")
    def style_api(s: api): Api = js.native
    @JSName("style")
    def style_multi(s: multi): Api = js.native
    @JSName("style")
    def style_os(s: os): Api = js.native
    @JSName("style")
    def style_single(s: single): Api = js.native
  }
}
