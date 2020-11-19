package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_pull")
@js.native
object cryptoSecretstreamXchacha20poly1305Pull extends js.Object {
  
  def apply(state_address: StateAddress, cipher: String): MessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: String,
    ad: js.UndefOr[scala.Nothing],
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: String): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: String, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: String, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: Null, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: Null, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: js.typedarray.Uint8Array): MessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: String,
    ad: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringMessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: String,
    ad: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: js.typedarray.Uint8Array): MessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.UndefOr[scala.Nothing],
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: js.typedarray.Uint8Array, ad: String): MessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: String,
    outputFormat: StringOutputFormat
  ): StringMessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: String,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: Null,
    outputFormat: StringOutputFormat
  ): StringMessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: Null,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: js.typedarray.Uint8Array, ad: js.typedarray.Uint8Array): MessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringMessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
}
