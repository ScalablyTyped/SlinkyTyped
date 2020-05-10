package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationMapping extends js.Object {
  var beforeInsert: js.UndefOr[
    js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[Unit] | Unit]
  ] = js.native
  var filter: js.UndefOr[
    (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ]
    ]) | String | js.Object
  ] = js.native
  var join: RelationJoin = js.native
  var modelClass: js.Function0[ModelClass[_]] | ModelClass[_] | String = js.native
  var modify: js.UndefOr[
    (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ]
    ]) | String | js.Object
  ] = js.native
  var relation: Relation = js.native
}

object RelationMapping {
  @scala.inline
  def apply(
    join: RelationJoin,
    modelClass: js.Function0[ModelClass[_]] | ModelClass[_] | String,
    relation: Relation
  ): RelationMapping = {
    val __obj = js.Dynamic.literal(join = join.asInstanceOf[js.Any], modelClass = modelClass.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationMapping]
  }
  @scala.inline
  implicit class RelationMappingOps[Self <: RelationMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJoin(value: RelationJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelClassFunction0(value: () => ModelClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModelClass(value: js.Function0[ModelClass[_]] | ModelClass[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelation(value: Relation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeInsert(value: (/* model */ Model, /* context */ QueryContext) => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(
      value: /* queryBuilder */ QueryBuilder[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ] => QueryBuilder[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(
      value: (js.Function1[
          /* queryBuilder */ QueryBuilder[
            _, 
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
          ], 
          QueryBuilder[
            _, 
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
          ]
        ]) | String | js.Object
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyFunction1(
      value: /* queryBuilder */ QueryBuilder[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ] => QueryBuilder[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModify(
      value: (js.Function1[
          /* queryBuilder */ QueryBuilder[
            _, 
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
          ], 
          QueryBuilder[
            _, 
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
          ]
        ]) | String | js.Object
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify")(js.undefined)
        ret
    }
  }
  
}

