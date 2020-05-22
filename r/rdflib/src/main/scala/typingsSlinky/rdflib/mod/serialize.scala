package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.anon.Flags
import typingsSlinky.rdflib.formulaMod.default
import typingsSlinky.rdflib.typesMod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "serialize")
@js.native
object serialize extends js.Object {
  def apply(/** The graph or nodes that should be serialized */
  target: default): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typingsSlinky.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
}

