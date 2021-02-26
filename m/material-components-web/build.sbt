organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "8.0.0-b9fe26"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "8.0.0-73a63a",
  "org.scalablytyped.slinky" %%% "material__banner" % "8.0.0-ff6290",
  "org.scalablytyped.slinky" %%% "material__base" % "8.0.0-33b576",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "8.0.0-dd015b",
  "org.scalablytyped.slinky" %%% "material__chips" % "8.0.0-d28c0b",
  "org.scalablytyped.slinky" %%% "material__circular-progress" % "8.0.0-458820",
  "org.scalablytyped.slinky" %%% "material__data-table" % "8.0.0-8d30fd",
  "org.scalablytyped.slinky" %%% "material__dialog" % "8.0.0-18a4a8",
  "org.scalablytyped.slinky" %%% "material__dom" % "8.0.0-e8d692",
  "org.scalablytyped.slinky" %%% "material__drawer" % "8.0.0-58d068",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "8.0.0-79b610",
  "org.scalablytyped.slinky" %%% "material__form-field" % "8.0.0-08e2e1",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "8.0.0-35c2a3",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "8.0.0-30455f",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "8.0.0-1afbe5",
  "org.scalablytyped.slinky" %%% "material__list" % "8.0.0-23f09b",
  "org.scalablytyped.slinky" %%% "material__menu" % "8.0.0-41e86a",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "8.0.0-0cb230",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "8.0.0-9f093e",
  "org.scalablytyped.slinky" %%% "material__progress-indicator" % "8.0.0-6b517f",
  "org.scalablytyped.slinky" %%% "material__radio" % "8.0.0-c9ddff",
  "org.scalablytyped.slinky" %%% "material__ripple" % "8.0.0-57a530",
  "org.scalablytyped.slinky" %%% "material__segmented-button" % "8.0.0-5bdfb4",
  "org.scalablytyped.slinky" %%% "material__select" % "8.0.0-fd3351",
  "org.scalablytyped.slinky" %%% "material__slider" % "8.0.0-59b38d",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "8.0.0-6fbf1b",
  "org.scalablytyped.slinky" %%% "material__switch" % "8.0.0-70f7c5",
  "org.scalablytyped.slinky" %%% "material__tab" % "8.0.0-0e717d",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "8.0.0-42aa13",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "8.0.0-409e99",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "8.0.0-77e6f4",
  "org.scalablytyped.slinky" %%% "material__textfield" % "8.0.0-e13ca5",
  "org.scalablytyped.slinky" %%% "material__tooltip" % "8.0.0-4b5b84",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "8.0.0-6ef0c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
