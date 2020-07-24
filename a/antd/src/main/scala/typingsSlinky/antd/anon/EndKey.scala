package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndKey extends js.Object {
  var endKey: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ js.Any
  ] = js.undefined
  var expandedKeys: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
  ]
  var startKey: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ js.Any
  ] = js.undefined
  var treeData: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
  ]
}

object EndKey {
  @scala.inline
  def apply(
    expandedKeys: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ],
    treeData: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
    ]
  ): EndKey = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey]
  }
  @scala.inline
  implicit class EndKeyOps[Self <: EndKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpandedKeysVarargs(value: js.Any*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDataVarargs(value: js.Any*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
        ]
    ): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ js.Any
    ): Self = this.set("endKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndKey: Self = this.set("endKey", js.undefined)
    @scala.inline
    def setStartKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ js.Any
    ): Self = this.set("startKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartKey: Self = this.set("startKey", js.undefined)
  }
  
}

