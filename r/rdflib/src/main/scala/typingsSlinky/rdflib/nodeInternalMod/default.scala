package typingsSlinky.rdflib.nodeInternalMod

import typingsSlinky.rdflib.tfTypesMod.Term
import typingsSlinky.rdflib.typesMod.Bindings
import typingsSlinky.rdflib.typesMod.FromValueReturns
import typingsSlinky.rdflib.typesMod.TermType
import typingsSlinky.rdflib.typesMod.ValueType
import typingsSlinky.rdflib.typesMod._ValueType
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/node-internal", JSImport.Default)
@js.native
abstract class default protected ()
  extends Node
     with _ValueType {
  protected def this(value: String) = this()
  /** The class order for this node */
  /* CompleteClass */
  override var classOrder: Double = js.native
  /** The type of node */
  /* CompleteClass */
  override var termType: TermType = js.native
  /** The node's value */
  /* CompleteClass */
  override var value: String = js.native
  /**
    * Compares this node with another
    * @see {equals} to check if two nodes are equal
    * @param other - The other node
    */
  /* CompleteClass */
  override def compareTerm(other: Node): Double = js.native
  /**
    * Compares whether the two nodes are equal
    * @param other The other node
    */
  /* CompleteClass */
  override def equals(other: Term): Boolean = js.native
  /**
    * Creates a hash for this node
    * @deprecated use {rdfFactory.id} instead if possible
    */
  /* CompleteClass */
  override def hashString(): String = js.native
  /**
    * Compares whether this node is the same as the other one
    * @param other - Another node
    */
  /* CompleteClass */
  override def sameTerm(other: Node): Boolean = js.native
  /**
    * Creates the substituted node for this one, according to the specified bindings
    * @param bindings - Bindings of identifiers to nodes
    */
  /* CompleteClass */
  override def substitute[T /* <: Node */](bindings: Bindings): T = js.native
  /**
    * Creates a canonical string representation of this node
    */
  /* CompleteClass */
  override def toCanonical(): String = js.native
  /**
    * Creates a n-quads string representation of this node
    */
  /* CompleteClass */
  override def toNQ(): String = js.native
  /**
    * Creates a n-triples string representation of this node
    */
  /* CompleteClass */
  override def toNT(): String = js.native
}

/* static members */
@JSImport("rdflib/lib/node-internal", JSImport.Default)
@js.native
object default extends js.Object {
  def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
  def toJS(term: js.Any): js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object]) = js.native
}

