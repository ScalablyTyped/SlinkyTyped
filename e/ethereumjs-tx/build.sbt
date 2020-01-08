organization := "org.scalablytyped.slinky"
name := "ethereumjs-tx"
version := "2.1.2-8c4966"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20190328Z-b8d95e",
  "org.scalablytyped.slinky" %%% "ethereumjs-common" % "1.3.2-9b59f8",
  "org.scalablytyped.slinky" %%% "ethereumjs-util" % "6.2.0-df206c",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "rlp" % "2.2.3-e7ad06",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        