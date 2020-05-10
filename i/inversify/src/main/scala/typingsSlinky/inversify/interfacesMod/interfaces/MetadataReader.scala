package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataReader extends js.Object {
  def getConstructorMetadata(constructorFunc: js.Function): ConstructorMetadata = js.native
  def getPropertiesMetadata(constructorFunc: js.Function): MetadataMap = js.native
}

object MetadataReader {
  @scala.inline
  def apply(
    getConstructorMetadata: js.Function => ConstructorMetadata,
    getPropertiesMetadata: js.Function => MetadataMap
  ): MetadataReader = {
    val __obj = js.Dynamic.literal(getConstructorMetadata = js.Any.fromFunction1(getConstructorMetadata), getPropertiesMetadata = js.Any.fromFunction1(getPropertiesMetadata))
    __obj.asInstanceOf[MetadataReader]
  }
  @scala.inline
  implicit class MetadataReaderOps[Self <: MetadataReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConstructorMetadata(value: js.Function => ConstructorMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstructorMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPropertiesMetadata(value: js.Function => MetadataMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertiesMetadata")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

