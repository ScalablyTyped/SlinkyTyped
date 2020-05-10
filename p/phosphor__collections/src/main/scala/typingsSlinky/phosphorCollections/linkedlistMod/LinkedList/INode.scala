package typingsSlinky.phosphorCollections.linkedlistMod.LinkedList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents a node in a linked list.
  *
  * #### Notes
  * User code will not create linked list nodes directly. Nodes
  * are created automatically when values are added to a list.
  */
@js.native
trait INode[T] extends js.Object {
  /**
    * The linked list which created and owns the node.
    *
    * This will be `null` when the node is removed from the list.
    */
  val list: typingsSlinky.phosphorCollections.linkedlistMod.LinkedList[T] | Null = js.native
  /**
    * The next node in the list.
    *
    * This will be `null` when the node is the last node in the list
    * or when the node is removed from the list.
    */
  val next: INode[T] | Null = js.native
  /**
    * The previous node in the list.
    *
    * This will be `null` when the node is the first node in the list
    * or when the node is removed from the list.
    */
  val prev: INode[T] | Null = js.native
  /**
    * The user value stored in the node.
    */
  val value: T = js.native
}

object INode {
  @scala.inline
  def apply[T](value: T): INode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INode[T]]
  }
  @scala.inline
  implicit class INodeOps[Self[t] <: INode[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: typingsSlinky.phosphorCollections.linkedlistMod.LinkedList[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(null)
        ret
    }
    @scala.inline
    def withNext(value: INode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(null)
        ret
    }
    @scala.inline
    def withPrev(value: INode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(null)
        ret
    }
  }
  
}

