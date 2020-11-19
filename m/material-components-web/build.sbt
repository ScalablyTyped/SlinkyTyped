organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "7.0.0-f563d7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "7.0.0-6f89c2",
  "org.scalablytyped.slinky" %%% "material__base" % "7.0.0-7a21fc",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "7.0.0-ce6ce2",
  "org.scalablytyped.slinky" %%% "material__chips" % "7.0.0-af085b",
  "org.scalablytyped.slinky" %%% "material__circular-progress" % "7.0.0-ec7e4d",
  "org.scalablytyped.slinky" %%% "material__data-table" % "7.0.0-a67c8f",
  "org.scalablytyped.slinky" %%% "material__dialog" % "7.0.0-aa1873",
  "org.scalablytyped.slinky" %%% "material__dom" % "7.0.0-864ca0",
  "org.scalablytyped.slinky" %%% "material__drawer" % "7.0.0-071674",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "7.0.0-808b38",
  "org.scalablytyped.slinky" %%% "material__form-field" % "7.0.0-1007fc",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "7.0.0-c356be",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "7.0.0-33a349",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "7.0.0-4525bf",
  "org.scalablytyped.slinky" %%% "material__list" % "7.0.0-8f487e",
  "org.scalablytyped.slinky" %%% "material__menu" % "7.0.0-1d3e25",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "7.0.0-8f3672",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "7.0.0-fdbb49",
  "org.scalablytyped.slinky" %%% "material__progress-indicator" % "7.0.0-62eea0",
  "org.scalablytyped.slinky" %%% "material__radio" % "7.0.0-2935f3",
  "org.scalablytyped.slinky" %%% "material__ripple" % "7.0.0-a8ae6d",
  "org.scalablytyped.slinky" %%% "material__select" % "7.0.0-46affd",
  "org.scalablytyped.slinky" %%% "material__slider" % "7.0.0-57f277",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "7.0.0-b4e36e",
  "org.scalablytyped.slinky" %%% "material__switch" % "7.0.0-cc4e92",
  "org.scalablytyped.slinky" %%% "material__tab" % "7.0.0-f02608",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "7.0.0-7aa8b4",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "7.0.0-53c732",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "7.0.0-c6716e",
  "org.scalablytyped.slinky" %%% "material__textfield" % "7.0.0-66467d",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "7.0.0-f4eb0b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
