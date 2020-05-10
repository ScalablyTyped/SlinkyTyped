package typingsSlinky.draftJs.mod.Draft.Model.ImmutableData

import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
trait ContentBlock extends js.Object {
  /**
    * Execute a callback for every contiguous range of entities within the block.
    */
  def findEntityRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  /**
    * Execute a callback for every contiguous range of styles within the block.
    */
  def findStyleRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  def getCharacterList(): List[CharacterMetadata] = js.native
  def getData(): Map[_, _] = js.native
  def getDepth(): Double = js.native
  def getEntityAt(offset: Double): String = js.native
  def getInlineStyleAt(offset: Double): DraftInlineStyle = js.native
  def getKey(): String = js.native
  def getLength(): Double = js.native
  def getText(): String = js.native
  def getType(): DraftBlockType = js.native
}

object ContentBlock {
  @scala.inline
  def apply(
    findEntityRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit,
    findStyleRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit,
    getCharacterList: () => List[CharacterMetadata],
    getData: () => Map[_, _],
    getDepth: () => Double,
    getEntityAt: Double => String,
    getInlineStyleAt: Double => DraftInlineStyle,
    getKey: () => String,
    getLength: () => Double,
    getText: () => String,
    getType: () => DraftBlockType
  ): ContentBlock = {
    val __obj = js.Dynamic.literal(findEntityRanges = js.Any.fromFunction2(findEntityRanges), findStyleRanges = js.Any.fromFunction2(findStyleRanges), getCharacterList = js.Any.fromFunction0(getCharacterList), getData = js.Any.fromFunction0(getData), getDepth = js.Any.fromFunction0(getDepth), getEntityAt = js.Any.fromFunction1(getEntityAt), getInlineStyleAt = js.Any.fromFunction1(getInlineStyleAt), getKey = js.Any.fromFunction0(getKey), getLength = js.Any.fromFunction0(getLength), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[ContentBlock]
  }
  @scala.inline
  implicit class ContentBlockOps[Self <: ContentBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindEntityRanges(
      value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findEntityRanges")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFindStyleRanges(
      value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findStyleRanges")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCharacterList(value: () => List[CharacterMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharacterList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetData(value: () => Map[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDepth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDepth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEntityAt(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInlineStyleAt(value: Double => DraftInlineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInlineStyleAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => DraftBlockType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

