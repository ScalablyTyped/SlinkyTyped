package typingsSlinky.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Types[T] extends js.Object {
  
  /** Asserts that the reference value is an arguments object. */
  def arguments(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is an Array. */
  def array(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is a boolean. */
  def boolean(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is a Buffer. */
  def buffer(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is a Date. */
  def date(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is an error. */
  def error(): AssertionChain[T] = js.native
  def error(`type`: js.UndefOr[scala.Nothing], message: String): AssertionChain[T] = js.native
  def error(`type`: js.UndefOr[scala.Nothing], message: js.RegExp): AssertionChain[T] = js.native
  def error(`type`: js.Any): AssertionChain[T] = js.native
  def error(`type`: js.Any, message: String): AssertionChain[T] = js.native
  def error(`type`: js.Any, message: js.RegExp): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is a function. */
  def function(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is a number. */
  def number(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is an object (excluding array, buffer, or other native objects). */
  def `object`(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is a RegExp. */
  def regexp(): AssertionChain[T] = js.native
  
  /** Asserts that the reference value is a string. */
  def string(): AssertionChain[T] = js.native
}
