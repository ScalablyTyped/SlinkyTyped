package typingsSlinky.kuromoji.mod

import typingsSlinky.doublearray.doublearray.DoubleArray
import typingsSlinky.kuromoji.anon.Tokeninfodictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictionaryBuilder_ extends js.Object {
  var tid_entries: js.Array[String] = js.native
  var unk_entries: js.Array[String] = js.native
  def addTokenInfoDictionary(text: String): DictionaryBuilder_ = js.native
  def build(): DynamicDictionaries = js.native
  def buildConnectionCosts(): ConnectionCosts = js.native
  def buildDoubleArray(): DoubleArray = js.native
  def buildTokenInfoDictionary(): Tokeninfodictionary = js.native
  def buildUnknownDictionary(): UnknownDictionary = js.native
  def charDef(char_text: String): DictionaryBuilder_ = js.native
  def costMatrix(matrix_text: String): DictionaryBuilder_ = js.native
  def unkDef(text: String): DictionaryBuilder_ = js.native
}

object DictionaryBuilder_ {
  @scala.inline
  def apply(
    addTokenInfoDictionary: String => DictionaryBuilder_,
    build: () => DynamicDictionaries,
    buildConnectionCosts: () => ConnectionCosts,
    buildDoubleArray: () => DoubleArray,
    buildTokenInfoDictionary: () => Tokeninfodictionary,
    buildUnknownDictionary: () => UnknownDictionary,
    charDef: String => DictionaryBuilder_,
    costMatrix: String => DictionaryBuilder_,
    tid_entries: js.Array[String],
    unkDef: String => DictionaryBuilder_,
    unk_entries: js.Array[String]
  ): DictionaryBuilder_ = {
    val __obj = js.Dynamic.literal(addTokenInfoDictionary = js.Any.fromFunction1(addTokenInfoDictionary), build = js.Any.fromFunction0(build), buildConnectionCosts = js.Any.fromFunction0(buildConnectionCosts), buildDoubleArray = js.Any.fromFunction0(buildDoubleArray), buildTokenInfoDictionary = js.Any.fromFunction0(buildTokenInfoDictionary), buildUnknownDictionary = js.Any.fromFunction0(buildUnknownDictionary), charDef = js.Any.fromFunction1(charDef), costMatrix = js.Any.fromFunction1(costMatrix), tid_entries = tid_entries.asInstanceOf[js.Any], unkDef = js.Any.fromFunction1(unkDef), unk_entries = unk_entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryBuilder_]
  }
  @scala.inline
  implicit class DictionaryBuilder_Ops[Self <: DictionaryBuilder_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTokenInfoDictionary(value: String => DictionaryBuilder_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTokenInfoDictionary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuild(value: () => DynamicDictionaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuildConnectionCosts(value: () => ConnectionCosts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildConnectionCosts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuildDoubleArray(value: () => DoubleArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDoubleArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuildTokenInfoDictionary(value: () => Tokeninfodictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildTokenInfoDictionary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuildUnknownDictionary(value: () => UnknownDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUnknownDictionary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCharDef(value: String => DictionaryBuilder_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charDef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCostMatrix(value: String => DictionaryBuilder_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTid_entries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tid_entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnkDef(value: String => DictionaryBuilder_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unkDef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnk_entries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unk_entries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

