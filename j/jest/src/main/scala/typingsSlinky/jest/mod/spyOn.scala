package typingsSlinky.jest.mod

import typingsSlinky.jest.mod.jasmine.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest", "spyOn")
@js.native
object spyOn extends js.Object {
  
  // Jest ships with a copy of Jasmine. They monkey-patch its APIs and divergence/deprecation are expected.
  // Relevant parts of Jasmine's API are below so they can be changed and removed over time.
  // This file can't reference jasmine.d.ts since the globals aren't compatible.
  def apply[T](`object`: T, method: /* keyof T */ String): Spy = js.native
}
