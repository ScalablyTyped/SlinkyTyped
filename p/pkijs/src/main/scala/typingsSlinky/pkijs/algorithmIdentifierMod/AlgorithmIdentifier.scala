package typingsSlinky.pkijs.algorithmIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmIdentifier extends js.Object {
  var algorithmId: String = js.native
  var algorithmParams: js.Any = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Check that two "AlgorithmIdentifiers" are equal
    * @param {AlgorithmIdentifier} algorithmIdentifier
    * @returns {boolean}
    */
  def isEqual(algorithmIdentifier: AlgorithmIdentifier): Boolean = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object AlgorithmIdentifier {
  @scala.inline
  def apply(
    algorithmId: String,
    algorithmParams: js.Any,
    fromSchema: js.Any => Unit,
    isEqual: AlgorithmIdentifier => Boolean,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AlgorithmIdentifier = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], algorithmParams = algorithmParams.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), isEqual = js.Any.fromFunction1(isEqual), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[AlgorithmIdentifier]
  }
  @scala.inline
  implicit class AlgorithmIdentifierOps[Self <: AlgorithmIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEqual(value: AlgorithmIdentifier => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

