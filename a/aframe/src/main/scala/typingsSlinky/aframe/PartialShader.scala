package typingsSlinky.aframe

import typingsSlinky.aframe.mod.Schema_
import typingsSlinky.three.mod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.Shader> */
@js.native
trait PartialShader extends js.Object {
  var data: js.UndefOr[js.Object] = js.native
  var fragmentShader: js.UndefOr[String] = js.native
  var init: js.UndefOr[
    js.Function1[
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
      ], 
      Unit
    ]
  ] = js.native
  var material: js.UndefOr[Material] = js.native
  var name: js.UndefOr[String] = js.native
  var schema: js.UndefOr[
    Schema_[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ]
  ] = js.native
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.native
  var update: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any, 
      Unit
    ]
  ] = js.native
  var vertexShader: js.UndefOr[String] = js.native
}

object PartialShader {
  @scala.inline
  def apply(): PartialShader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShader]
  }
  @scala.inline
  implicit class PartialShaderOps[Self <: PartialShader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(
      value: /* data */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(
      value: Schema_[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withTick(value: (/* time */ Double, /* timeDelta */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(js.undefined)
        ret
    }
  }
  
}

