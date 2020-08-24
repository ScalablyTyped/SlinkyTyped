organization := "org.scalablytyped.slinky"
name := "mem-fs-editor"
version := "7.0-dt-20200707Z-128221"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ejs" % "3.0-dt-20200515Z-028119",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-07f914",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200609Z-920bb6",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-059544",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-f9bd51",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-68d52f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
