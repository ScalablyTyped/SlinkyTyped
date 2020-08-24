organization := "org.scalablytyped.slinky"
name := "ethereumjs-tx"
version := "2.1.2-ee7d6b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-b98b93",
  "org.scalablytyped.slinky" %%% "ethereumjs-common" % "1.5.2-ccb705",
  "org.scalablytyped.slinky" %%% "ethereumjs-util" % "7.0.3-1faa8e",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "rlp" % "2.2.6-c5cd96",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
