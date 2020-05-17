package typingsSlinky.sade.mod

import typingsSlinky.sade.anon.Args
import typingsSlinky.sade.anon.ReadonlyCommandOptions
import typingsSlinky.sade.anon.ReadonlyParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sade extends js.Object {
  def action(handler: Handler): Sade = js.native
  def command(str: String): Sade = js.native
  def command(str: String, desc: String): Sade = js.native
  def command(str: String, desc: String, opts: ReadonlyCommandOptions): Sade = js.native
  def describe(str: String): Sade = js.native
  def describe(str: js.Array[String]): Sade = js.native
  def example(str: String): Sade = js.native
  def help(str: String): Unit = js.native
  def option(str: String, desc: String): Sade = js.native
  def option(str: String, desc: String, `val`: String): Sade = js.native
  def option(str: String, desc: String, `val`: Double): Sade = js.native
  def parse(arr: js.Array[String]): Args | Unit = js.native
  def parse(arr: js.Array[String], opts: ReadonlyParseOptions): Args | Unit = js.native
  def version(str: String): Sade = js.native
}

