package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.MessageTag
import typingsSlinky.libsodiumWrappers.mod.StateAddress
import typingsSlinky.libsodiumWrappers.mod.StringMessageTag
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
@js.native
object cryptoSecretstreamXchacha20poly1305Pull extends js.Object {
  def apply(state_address: StateAddress, cipher: String): MessageTag = js.native
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

