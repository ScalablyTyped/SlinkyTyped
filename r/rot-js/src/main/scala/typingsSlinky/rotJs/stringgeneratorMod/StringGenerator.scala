package typingsSlinky.rotJs.stringgeneratorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringGenerator extends js.Object {
  var _boundary: String = js.native
  var _data: StringDictionary[Events] = js.native
  var _options: Options = js.native
  var _prefix: js.Array[String] = js.native
  var _priorValues: StringDictionary[Double] = js.native
  var _suffix: String = js.native
  /**
    * @param {string[]}
    * @returns {string[]}
    */
  def _backoff(context: js.Array[String]): js.Array[String] = js.native
  /**
    * @param {string[]}
    * @returns {string}
    */
  def _join(arr: js.Array[String]): String = js.native
  /**
    * @param {string[]} context
    * @param {string} event
    */
  def _observeEvent(context: js.Array[String], event: String): Unit = js.native
  /**
    * @param {string[]}
    * @returns {string}
    */
  def _sample(context: js.Array[String]): String = js.native
  /**
    * @param {string}
    * @returns {string[]}
    */
  def _split(str: String): js.Array[String] = js.native
  /**
    * Remove all learning data
    */
  def clear(): Unit = js.native
  /**
    * @returns {string} Generated string
    */
  def generate(): String = js.native
  def getStats(): String = js.native
  /**
    * Observe (learn) a string from a training set
    */
  def observe(string: String): Unit = js.native
}

object StringGenerator {
  @scala.inline
  def apply(
    _backoff: js.Array[String] => js.Array[String],
    _boundary: String,
    _data: StringDictionary[Events],
    _join: js.Array[String] => String,
    _observeEvent: (js.Array[String], String) => Unit,
    _options: Options,
    _prefix: js.Array[String],
    _priorValues: StringDictionary[Double],
    _sample: js.Array[String] => String,
    _split: String => js.Array[String],
    _suffix: String,
    clear: () => Unit,
    generate: () => String,
    getStats: () => String,
    observe: String => Unit
  ): StringGenerator = {
    val __obj = js.Dynamic.literal(_backoff = js.Any.fromFunction1(_backoff), _boundary = _boundary.asInstanceOf[js.Any], _data = _data.asInstanceOf[js.Any], _join = js.Any.fromFunction1(_join), _observeEvent = js.Any.fromFunction2(_observeEvent), _options = _options.asInstanceOf[js.Any], _prefix = _prefix.asInstanceOf[js.Any], _priorValues = _priorValues.asInstanceOf[js.Any], _sample = js.Any.fromFunction1(_sample), _split = js.Any.fromFunction1(_split), _suffix = _suffix.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), generate = js.Any.fromFunction0(generate), getStats = js.Any.fromFunction0(getStats), observe = js.Any.fromFunction1(observe))
    __obj.asInstanceOf[StringGenerator]
  }
  @scala.inline
  implicit class StringGeneratorOps[Self <: StringGenerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_backoff(value: js.Array[String] => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_backoff")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_boundary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_data(value: StringDictionary[Events]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_join(value: js.Array[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_join")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_observeEvent(value: (js.Array[String], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_observeEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_options(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_prefix(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_priorValues(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_priorValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sample(value: js.Array[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sample")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_split(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_split")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGenerate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStats(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObserve(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

