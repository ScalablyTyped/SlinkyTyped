package typingsSlinky.datatablesDotNetDashSelect

import typingsSlinky.datatablesDotNetDashSelect.DataTables.Api
import typingsSlinky.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.api
import typingsSlinky.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.multi
import typingsSlinky.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.os
import typingsSlinky.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Api extends js.Object {
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

